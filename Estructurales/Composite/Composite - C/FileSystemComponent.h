#ifndef FILESYSTEMCOMPONENT_H
#define FILESYSTEMCOMPONENT_H

#include <iostream>
#include <fstream>
#include <string>

class FileSystemComponent {
public :
    virtual ~FileSystemComponent() = default ;
    virtual void showDetails() const = 0 ;
    virtual bool findSensitiveData() const = 0 ;
    virtual bool checkForSuspiciousActivity() const = 0 ;
    virtual int getDepth() const = 0 ;
};



#endif // FILESYSTEMCOMPONENT_H
