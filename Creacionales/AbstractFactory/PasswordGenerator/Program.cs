class Program
{
    static void Main(string[] args) 
    {
        PasswordFactory specialFactory = new SpecialCharacterPasswordFactory();

        IPassword specialPassword = specialFactory.CreatePassword();

        IPassword contraseñaParaMiFacebook = specialFactory.CreatePassword();

        Console.WriteLine($"Contraseña con caracteres especiales {specialPassword.GeneratePassword()}");
        Console.WriteLine($"Contraseña para mi Facebook: {contraseñaParaMiFacebook.GeneratePassword()}");

        PasswordFactory memorableFactory = new MemorablePasswordFactory();

        IPassword memorablePassword = memorableFactory.CreatePassword();
        IPassword contraseña2 = memorableFactory.CreatePassword();

        Console.WriteLine($"Contraseña con mis palabras: {memorablePassword.GeneratePassword()}");
        Console.WriteLine($"Otra contraseña de ejemplo: {contraseña2.GeneratePassword()}");
    }

}