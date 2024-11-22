from Message import Message
from MessageFactory import MessageFactory
from EmailMessage import EmailMessage

class EmailMessageFactory(MessageFactory):
    def createMessage(self) -> EmailMessage:
        return EmailMessage()