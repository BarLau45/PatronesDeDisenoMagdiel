from User import User
import re

class UserAdapter:
    def __init__(self, external_user_df, logger):
        self.external_user_df = external_user_df
        self.logger = logger

    def is_valid_email(self, email):
        pattern = r'^\b[A-Za-z0-9]+@[A-Za-z0-9]+\.[A-Z|a-z]{2,}\b'
        return re.match(pattern, email)
    
    def get_users(self):
        users = []
        for user in self.external_user_df.iterrows():
            email = user['email']
            if self.is_valid_email(email):
                users.append(User(user['id'], user['name'], email))
                self.logger.log_info(f"Usuario creado correctamente {email}")
            else:
                self.logger.log_error(f"Usuario no pudo ser creado {email}")
        return users
        
    def filter_user_by_domain(self, domain):
        users = self.get_users()
        filtered = (user for user in users if user.email.endswitch(f'@{domain}'))
        return filtered