import random

class Driver:
    def __init__(self, name):
        self.name = name
        self.status = False
    
    def check_status(self):
        pass

class WinAudioDriver(Driver):
    def __init__(self):
        super().__init__("Audio")
        self.probability = random.uniform(0, 10)
    def check_status(self):
        self.status = self.probability > 3
        if self.status:
            return f"Driver '{self.name}' en Windows está funcionando"
        else:
            return f"Driver '{self.name}' en Windows no está funcionando"
        
class WinVideoDriver(Driver):
    def __init__(self):
        super().__init__("Video")
        self.probability = random.uniform(0, 10)
    def check_status(self):
        self.status = self.probability > 4
        if self.status:
            return f"Driver '{self.name}' en Windows está funcionando"
        else:
            return f"Driver '{self.name}' en Windows no está funcionando"

class MacAudioDriver(Driver):
    def __init__(self):
        super().__init__("Audio")
        self.probability = random.uniform(0, 10)
    def check_status(self):
        self.status = self.probability > 2
        if self.status:
            return f"Driver '{self.name}' en macOS está funcionando"
        else:
            return f"Driver '{self.name}' en macOS no está funcionando"
        
class MacNetworkDriver(Driver):
    def __init__(self):
        super().__init__("Red")
        self.probability = random.uniform(0, 10)
    def check_status(self):
        self.status = self.probability > 6
        if self.status:
            return f"Driver '{self.name}' en macOS está funcionando"
        else:
            return f"Driver '{self.name}' en macOS no está funcionando"