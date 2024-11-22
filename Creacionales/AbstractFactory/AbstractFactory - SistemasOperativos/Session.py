class Session:
    def __init__(self):
        self.usuario = ""
    def set_usuario(self, nombre):
        self.usuario = nombre
    def show_usuario(self, nombre):
        pass

class WinSession(Session):
    def show_usuario(self):
        return f"Sesión iniciada con: {self.usuario} en Windows"
    
class MacSession(Session):
    def show_usuario(self):
        return f"Sesión iniciada con: {self.usuario} en MacOS"