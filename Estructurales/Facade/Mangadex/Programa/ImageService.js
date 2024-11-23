import fs from 'fs';
import axios from 'axios';

class ImageService {
    async downloadImages(links, path) {
        for(const [i, link] of links.entries()) {
            try {
                const response = await axios({
                    method: 'GET',
                    url: link,
                    responseType: 'stream'
                })
                if(response.status !== 200) {
                    console.error(`Error: Status code ${response.status} for image ${link}`)
                    continue;
                }
                const fileStream = fs.createWriteStream(`${path}/pagina${i + 1}.jpg`)

                response.data.pipe(fileStream);

                await new Promise((resolve, reject)=>{
                    fileStream.on('finish', ()=>{
                        console.log(`página ${i + 1} descargada`)
                        resolve()
                    })
                    fileStream.on('error', err => {
                        console.error('error de escritura')
                        reject(err)
                    })
                })
            } catch(err) {
                console.error(`error al descargar la imagen ${i + 1}: ${err.message}`)
            }
        }
        console.log('Capítulo descargado')
    }
}

export default ImageService