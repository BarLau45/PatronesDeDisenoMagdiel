from UserManagerFacade import UserManagerFacade

def main():
    username = input("Escribe tu nombre de usuario: ")
    password = input("Escribe tu contraseña: ")
    email = input("Escribe tu correo electrónico: ")

    user_manager = UserManagerFacade()

    user_manager.register_user(username, password, email)

    print("\nIniciar Sesión")
    login_email = input("Escribe tu correo electrónico: ")
    login_password = input("Escribe tu contraseña: ")

    if login_email == email:
        user_manager.authenticate_user(username, login_password)
    else:
        print("Correo no registrado")

if __name__ == "__main__":
    main()