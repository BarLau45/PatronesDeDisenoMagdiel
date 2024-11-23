#include "ScriptFile.h"

void ScriptFile::showDetails() const {
    std::cout << "Script file: " << name << '\n' ;
}

bool ScriptFile::findSensitiveData() const {
    return false ;
}

bool ScriptFile::checkForSuspiciousActivity() const {
    std::ifstream file(name) ;
    std::string line ;

    while(std::getline(file, line)) {
        if(line.find("curl") != std::string::npos) {
            return true ;
        }
        
    }

    return false ;
}

int ScriptFile::getDepth() const {
    return 1 ;
}