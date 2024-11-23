#include "Folder.h"

void Folder::showDetails() const {
    std::cout << "Folder: " << name << '\n' ;
    for (const auto& component : components)
    {
        component->showDetails();
    }
    
}

bool Folder::findSensitiveData() const {
    bool found = false ;
    for(const auto& component : components) {
        found |= component->findSensitiveData() ;
    }
    return found ;
}

bool Folder::checkForSuspiciousActivity() const {
    bool found = false ;
    for(const auto& component : components) {
        found |= component->checkForSuspiciousActivity() ;
    }
    return found ;
}

int Folder::getDepth() const {
    int maxDepth = 0 ;
    for(const auto& component : components) {
        maxDepth = std::max(maxDepth, component->getDepth()) ;
    }
    return maxDepth + 1 ;
}

void Folder::autoClassifyFile(const std::string& path) {
    for(const auto& entry: std::filesystem::directory_iterator(path)) {
        std::string filename = entry.path().string() ;

        if(entry.is_directory()) {
            auto subfolder = std::make_shared<Folder>(filename) ;
            subfolder->autoClassifyFile(filename) ;
            add(subfolder) ;
            return ;
        }
        if (TextFile::isTextFile(filename)) {
            add(std::make_shared<TextFile>(filename)) ;
        }
        else if (ScriptFile::isScriptFile(filename)) {
            add(std::make_shared<ScriptFile>(filename)) ;
        }
        else
        {
            std::cout << "Archivo incorrecto " << filename << '\n' ;
        }
        
    }
}