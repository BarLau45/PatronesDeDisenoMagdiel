public class MemorablePasswordFactory : PasswordFactory
{
    public override IPassword CreatePassword()
    {
        return new MemorablePassword();
    }
}