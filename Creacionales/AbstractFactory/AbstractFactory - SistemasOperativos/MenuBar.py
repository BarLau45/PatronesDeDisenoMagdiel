class MenuBar:
    def paint(self):
        pass

class WinMenuBar(MenuBar):
    def paint(self):
        return "Renderizando barra de menú en Windows"
    
class MacMenuBar(MenuBar):
    def paint(self):
        return "Renderizando barra de menú en MacOS"