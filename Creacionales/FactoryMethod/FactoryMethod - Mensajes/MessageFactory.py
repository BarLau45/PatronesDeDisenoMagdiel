from abc import ABC, abstractmethod
from Message import Message

class MessageFactory(ABC):
    @abstractmethod
    def createMessage(self) -> Message:
        pass