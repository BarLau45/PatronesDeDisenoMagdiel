#include "TextFile.h"

void TextFile::showDetails() const {
    std:: cout << "Text file: " << name << '\n' ;
}

bool TextFile::findSensitiveData() const {
    std::ifstream file(name) ;
    std::string line ;
    while (std::getline(file, line))
    {
        if(line.find("password") != std::string::npos ) {
            std::cout << "Archivo sensible " << name << ' ' << line << '\n' ;
            return true ;
        }
    }
    return false ;
    
}

bool TextFile::checkForSuspiciousActivity() const {
    return false ;
}

int TextFile::getDepth() const {
    return 1 ;
}