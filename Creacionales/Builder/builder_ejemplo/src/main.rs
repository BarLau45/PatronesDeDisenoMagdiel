pub mod Componentes;
pub mod Builder;
pub mod Prefix;

use crate::Prefix::PrefixBuilder;
// use crate::Componentes::*;
use crate::Builder::Director;
fn main() {
    let mut builder = PrefixBuilder::default();
    Director::construct_cinnamon(&mut builder);
    let linux = builder.build();
    let _a = linux.save_prefix("linux.txt");

    // let mut builder2 = PrefixBuilder::default();
    // builder2.set_users(vec![User::from("Magdiel", "Exodo", true)]);
    // builder2.set_language("Spanish");
    // builder2.set_kl("en");
    // builder2.set_host("LASCA");
    // builder2.set_swap(true);
    // builder2.set_repos(vec![String::from("vim")]);

    // let arch = builder2.build();
    // let _a = arch.save_prefix("arch.txt");
}
