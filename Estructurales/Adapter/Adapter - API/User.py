class User:
    def __init__(self, user_id, name, email):
        self.user_id = user_id
        self.name = name
        self.email = email

    def __repr__(self):
        return f'ID: {self.user_id} nombre: {self.name} email: {self.email}'