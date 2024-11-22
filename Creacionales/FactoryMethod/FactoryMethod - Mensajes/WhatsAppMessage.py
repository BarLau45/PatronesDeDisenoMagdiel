import pywhatkit as kit
from Message import Message
import datetime

class WhatsAppMessage(Message):
    def send(self, recipient: str, content: str):
        now = datetime.datetime.now()
        hour = now.hour
        minute = now.minute + 2

        kit.sendwhatmsg(recipient, content, hour, minute)
        print(f"Mensaje de WhatsApp enviado a {recipient} a las {hour}:{minute}")