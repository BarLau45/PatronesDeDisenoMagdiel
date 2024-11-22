use crate::Componentes::User;
use std::fs::File;
use std::io::prelude::*;

pub struct PrefixSystem {
    users: Vec<User>,
    keyboard_layout: String,
    hostname: String,
    language: String,
    swap: bool,
    profiles: Vec<String>,
    optional_repositories: Vec<String>,
}

impl PrefixSystem {
    fn from(users: Vec<User>,
        keyboard_layout: String,
        hostname: String,
        language: String,
        swap: bool,
        profiles: Vec<String>,
        optional_repositories: Vec<String>) -> Self {
        
        return Self {
            users: users,
            keyboard_layout: keyboard_layout,
            hostname: hostname,
            language: language,
            swap: swap,
            profiles: profiles,
            optional_repositories: optional_repositories
        };
    }

    pub fn save_prefix(&self, filename: &str) -> std::io::Result<()> {

        let mut archivo = File::create(filename)?;
        let description: String = self.to_string();
        archivo.write_all(description.as_bytes())?;
        Ok(())
    }
}

impl std::fmt::Display for PrefixSystem {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        writeln!(f, "System_prefix_for_linux {{")?;
        writeln!(f, " User {{ {:?} \n}}", self.users)?;
        writeln!(f, " keyboard_layout: {}", self.keyboard_layout)?;
        writeln!(f, " language: {} ", self.language)?;
        writeln!(f, " hostname: {} ", self.hostname)?;
        writeln!(f, " swap: {} ", self.swap)?;
        writeln!(f, " profiles {{ {:?}  \n }} ", self.profiles)?;
        writeln!(f, " optional_repositories: {{ {:?} }} ", self.optional_repositories)?;
        writeln!(f, "}}")?;
        Ok(())
    }
}

use crate::Builder::Builder;

#[derive(Default)]
pub struct PrefixBuilder {
    users: Vec<User>,
    keyboard_layout: String,
    hostname: String,
    language: String,
    swap: bool,
    profiles: Vec<String>,
    optional_repositories: Vec<String>,
}

impl Builder for PrefixBuilder {
    type OutputType = PrefixSystem;

    fn set_users(&mut self, users: Vec<User>) {
        self.users = users;
    }

    fn set_kl(&mut self, kl: &str) {
        self.keyboard_layout = String::from(kl);
    }

    fn set_language(&mut self, language: &str) {
        self.language = String::from(language);
    }

    fn set_host(&mut self, host: &str) {
        self.hostname = String::from(host);
    }

    fn set_swap(&mut self, swap: bool) {
        self.swap = swap;

    }

    fn set_profile(&mut self, profile: Vec<String>) {
        self.profiles = profile;
    }

    fn set_repos(&mut self, repos: Vec<String>) {
        self.optional_repositories = repos;
    }

    fn build(&self) -> Self::OutputType {
        return PrefixSystem::from(self.users.clone(), self.keyboard_layout.clone(), 
                                  self.hostname.clone(), self.language.clone(), self.swap, 
                                  self.profiles.clone(), self.optional_repositories.clone());
    }
}