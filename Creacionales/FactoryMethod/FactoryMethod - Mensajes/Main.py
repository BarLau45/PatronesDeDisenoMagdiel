from SMSMessageFactory import SMSMessageFactory
from EmailMessageFactory import EmailMessageFactory
from WhatsAppMessageFactory import WhatsAppMessageFactory

def main():
    messageType = 'WhatsApp'
    recipient = '+529876543210'
    content = 'Préstame 200 varos te los pago el martes'

    if(messageType == 'sms'):
        factory = SMSMessageFactory()
    elif messageType == 'WhatsApp':
        factory = WhatsAppMessageFactory()
    elif messageType == 'email':
        factory = EmailMessageFactory()
    else:
        raise ValueError("Tipo de mensaje no encontrado")
    
    message = factory.createMessage()

    message.send(recipient, content)

if __name__ == "__main__":
    main()