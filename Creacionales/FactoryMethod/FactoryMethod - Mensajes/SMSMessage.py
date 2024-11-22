from twilio.rest import Client
from Message import Message
from Config import TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN, TWILIO_PHONE_NUMBER

class SMSMessage(Message):
    def send(self, recipient: str, content: str):
        client = Client(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN)
        Message = client.messages.create(
            body = content,
            from_ = TWILIO_PHONE_NUMBER,
            to = recipient
        )

        print(f"El mensaje sms fue enviado... {Message.sid}")    