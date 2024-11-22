from GUIFactory import *
from MenuBar import *
from Session import *
from Driver import *

class MacFactory(GUIFactory):
    def create_menubar(self):
        return MacMenuBar
    def create_session(self):
        return MacSession
    def create_drivers(self):
        return [MacAudioDriver(), MacNetworkDriver()]