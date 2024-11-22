#[derive(Clone)]

pub struct User{
    name : String,
    password : String,
    is_sudoer : bool
}

impl User{
    pub fn from(name : &str, password : &str, sudoer : bool) -> Self {
        return Self {
            name: String::from(name),
            password: String::from(password),
            is_sudoer: sudoer
        };
    }

    pub fn get_name(&self) -> String {
        return self.name.clone();
    }

    pub fn get_password(&self) -> String {
        return self.password.clone();
    }

    pub fn get_sudoer(&self) -> bool {
        return self.is_sudoer;
    }
}

impl std::fmt::Debug for User {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        writeln!(f, "User {{\n name: {}\n password: {}\n sudo: {}\n}} ", self.get_name(), self.get_password(), self.get_sudoer())?;
        Ok(())
        //f.debug_struct("User").field("name", &self.name).field("password", &self.password).field("sudoer", &self.is_sudoer).finish()
    }
} 