public class SpecialCharacterPasswordFactory : PasswordFactory
{
    public override IPassword CreatePassword()
    {
        return new SpecialCharacterPassword();
    }
}