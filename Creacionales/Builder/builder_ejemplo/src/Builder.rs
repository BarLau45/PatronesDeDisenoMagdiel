use crate::Componentes::User;

pub trait Builder {
    type OutputType;
    fn set_users(&mut self, users: Vec<User>);
    fn set_kl(&mut self, kl: &str);
    fn set_language(&mut self, language: &str);
    fn set_host(&mut self, host: &str);
    fn set_swap(&mut self, swap: bool);
    fn set_profile(&mut self, profile: Vec<String>);
    fn set_repos(&mut self, repos: Vec<String>);

    fn build(&self) -> Self::OutputType;
}

pub struct Director{}

impl Director {
    pub fn construct_cinnamon(builder: &mut impl Builder) {
        builder.set_users(vec![User::from("sebas", "sebas", true)]);
        builder.set_kl("es");
        builder.set_language("Spanish");
        builder.set_host("LIS");
        builder.set_swap(false);
        builder.set_profile(vec![String::from("Cinnamon")]);
        builder.set_repos(vec![String::from("git"), String::from("nano")]);
    }
}