#ifndef TEXTFILE_H
#define TEXTFILE_H

#include <iostream>
#include <fstream>
#include <string>
#include "FileSystemComponent.h"

class TextFile : public FileSystemComponent {
private:
    std::string name ;
public:

    TextFile(const std::string& name_) : name(name_) {}
    void showDetails() const override;
    bool findSensitiveData() const override ;
    bool checkForSuspiciousActivity() const override ;
    int getDepth() const override ;

    static bool isTextFile(const std::string& filename) {
        std::ifstream file(filename) ;
        return file.good() ;
    }
};
#endif // TEXTFILE_H
