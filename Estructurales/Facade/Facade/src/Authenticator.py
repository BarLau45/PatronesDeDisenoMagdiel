from hashlib import sha256

class Authenticator:
    def hash_password(self, password):
        return sha256(password.encode()).hexdigest()

    def authenticate(self, username, password, database):
        password_hash = self.hash_password(password)
        stored_hash = database.get_password_hash(username)
        if stored_hash and stored_hash == password_hash:
            print("Intentando autenticar al usuario con la contraseña correcta.")
            print("Autenticación exitosa.")
            return True
        print("Intentando autenticar al usuario con la contraseña incorrecta.")
        print("Autenticación fallida.")
        return False