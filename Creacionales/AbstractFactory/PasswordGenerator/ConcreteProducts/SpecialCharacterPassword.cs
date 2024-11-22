public class SpecialCharacterPassword : IPassword
{
    public string GeneratePassword()
    {
        string chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        return Generate(chars,16);
    }

    private string Generate(string chars, int length)
    {
        Random random = new Random();
        return new string(Enumerable.Repeat(chars, length).Select(S => S[random.Next(S.Length)]).ToArray());
    }
}
