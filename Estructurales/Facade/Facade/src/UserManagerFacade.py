from Authenticator import Authenticator
from Database import Database
from EmailService import EmailService

class UserManagerFacade:
    def __init__(self):
        self.database = Database()
        self.authenticator = Authenticator()
        self.email_service = EmailService()

    def register_user(self, username, password, email):
        password_hash = self.authenticator.hash_password(password)
        self.database.save_user(username, password_hash)
        self.email_service.send_welcome_email(username, email)

    def authenticate_user(self, username, password):
        return self.authenticator.authenticate(username, password, self.database)