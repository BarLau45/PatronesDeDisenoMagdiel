import smtplib
from email.mime.text import MIMEText

class EmailService:
    SMTP_SERVER = "smtp.gmail.com"
    SMTP_PORT = 587
    EMAIL_ADDRESS = "jr457944@gmail.com"
    EMAIL_PASSWORD = "lvce nizp jigr kpqf"

    def send_welcome_email(self, username, email):
        print(f"Enviando correo de bienvenida a {email}...")
        msg =MIMEText(f"Joseph deja a las de prepa")
        msg["Subject"]="Bienvenido"
        msg["To"] = email

        try:
            with smtplib.SMTP(self.SMTP_SERVER, self.SMTP_PORT) as server:
                server.starttls()
                server.login(self.EMAIL_ADDRESS, self.EMAIL_PASSWORD)
                server.sendmail(self.EMAIL_ADDRESS, email, msg.as_string())
                print(f"Correo de bienvenida enviado")
        except Exception as e:
            print("Error al enviar el correo")