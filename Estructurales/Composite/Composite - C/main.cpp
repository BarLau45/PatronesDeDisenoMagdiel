#include <iostream>
#include <memory>
#include "Folder.h"

int main() {
    auto folder = std::make_shared<Folder>("ProjectFolder");

    std::string path = "./" ;

    folder -> autoClassifyFile(path) ;
    folder -> findSensitiveData() ;
    folder -> checkForSuspiciousActivity() ;
}
