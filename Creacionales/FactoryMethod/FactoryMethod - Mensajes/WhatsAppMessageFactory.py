from MessageFactory import MessageFactory
from Message import Message
from WhatsAppMessage import WhatsAppMessage

class WhatsAppMessageFactory(MessageFactory):
    def createMessage(self) -> WhatsAppMessage:
        return WhatsAppMessage()