from abc import ABC, abstractmethod

class Message(ABC):
    @abstractmethod
    def send(self, recipient: str, content: str):
        pass