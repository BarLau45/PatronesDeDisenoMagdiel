from GUIFactory import *
from MenuBar import *
from Session import *
from Driver import *

class WinFactory(GUIFactory):
    def create_menubar(self):
        return WinMenuBar
    def create_session(self):
        return WinSession
    def create_drivers(self):
        return [WinAudioDriver(), WinVideoDriver()]