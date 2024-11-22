import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from Message import Message
from Config import SMTP_SERVER, SMTP_PORT, SMTP_PASSWORD, SMTP_USER

class EmailMessage(Message):
    def send(self, recipient: str, content: str):
        msg = MIMEMultipart()
        msg['From'] = SMTP_USER
        msg['to'] = recipient
        msg['Subject'] = 'Subject of the email'

        msg.attach(MIMEText(content, 'plain'))

        try:
            with smtplib.SMTP(SMTP_SERVER, SMTP_PORT) as server:
                server.starttls()
                server.login(SMTP_USER, SMTP_PASSWORD)
                text = msg.as_string()
                server.sendmail(SMTP_USER, recipient, text)
            print("Email sent.")

        except Exception as e:
            print(f"Error at sending the email: {e}")