import MangaService from "./MangaService.js";
import ChapterService from "./ChapterService.js";
import ImageService from "./ImageService.js";
import readline from 'node:readline';
import { stdin as input, stdout as output } from 'node:process';
import fs from 'node:fs';

class MangaDexAPI {
    #mangaService
    #chapterService
    #imageService

    constructor() {
        this.#chapterService = new ChapterService()
        this.#mangaService = new MangaService()
        this.#imageService = new ImageService()
    }

    searchManga(title) {
        return this.#mangaService.getMangas(title)
    }

    async getChapters(mangaID, limit, offset, languages) {
        const chapters = await this.#chapterService.getChapters(mangaID, limit, offset, languages)
        return chapters
    }

    downloadChapterImages(chapter, manga) {
        this.#chapterService.getImages(chapter.id)
            .then((data)=>{
                if(!fs.existsSync("imagenes")){
                    fs.mkdirSync("imagenes")
                    
                }
                if(!fs.existsSync(`imagenes/${manga.title.en + chapter.chapterNumber}`)) {
                    fs.mkdirSync(`imagenes/${manga.title.en + chapter.chapterNumber}`)
                }
                this.#imageService.downloadImages(data.data, `imagenes/${manga.title.en + chapter.chapterNumber}`)
            })
            .catch(error=>{
                console.error("Error al descargar el capítulo", error)
            })
    }
}

const api = new MangaDexAPI()
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function makeQuestion(question) {
    return new Promise((resolve) => {
        rl.question(question, (response) => {
            resolve(response);
        });
    });
}

async function main() {
    const searchTitle = await makeQuestion("inserta el nombre del manga que buscas: ")
    const data = await api.searchManga(searchTitle)
    console.table(data.map((manga) => manga.title))

    const manga_index_selected = await makeQuestion("elige el manga por el indice: ")
    const chapters = await api.getChapters(data[manga_index_selected].id,20,0,["es-la"])
    console.table(chapters.chapters.map((chapter) => [chapter.chapterNumber, chapter.title]))
    console.log("ultima pagina",chapters.total)
    const chapterIndex = await makeQuestion("elige el capitulo por el indice no numero: ")
    const chapterSelected = chapters.chapters[chapterIndex]
    api.downloadChapterImages(chapterSelected,data[manga_index_selected])
    rl.close()
}
main()