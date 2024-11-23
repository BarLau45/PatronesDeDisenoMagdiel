#ifndef SCRIPTFILE_H
#define SCRIPTFILE_H

#include <iostream>
#include <fstream>
#include <string>
#include "FileSystemComponent.h"

class ScriptFile : public FileSystemComponent {
private:
    std::string name ;
public:
    ScriptFile(const std::string& name_) : name(name_) {}
    bool findSensitiveData() const override ;
    bool checkForSuspiciousActivity() const override ;
    void showDetails() const override ;
    int getDepth() const override ;

    static bool isScriptFile(const std::string& filename) {
        std::ifstream file(filename) ;
        return file.good() ;
    }
};

#endif // SCRIPTFILE_H
