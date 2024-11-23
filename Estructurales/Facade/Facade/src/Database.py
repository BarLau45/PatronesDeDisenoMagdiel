from hashlib import sha256

class Database:
    def __init__(self):
        self.users = {}

    def save_user(self, username, password_hash):
        self.users[username] = password_hash
        print(f"Usuario '{username}' guardado en la base de datos.")

    def get_password_hash(self, username):
        return self.users.get(username)