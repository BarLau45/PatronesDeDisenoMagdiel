from Message import Message
from MessageFactory import MessageFactory
from SMSMessage import SMSMessage

class SMSMessageFactory(MessageFactory):
    def createMessage(self) -> Message:
        return SMSMessage()