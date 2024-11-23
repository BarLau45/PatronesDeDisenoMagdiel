pub mod proxy;

use proxy::*;
use std::io::stdin;
fn main() {
    menu();
}

fn input_string() -> String{
    let mut input = String::new();
    stdin().read_line(&mut input).expect("Something went wrong");
    input = input.trim().to_string();
    return input;
}

fn choice() -> bool{
    let mut input = String::new();
    stdin().read_line(&mut input).expect("Something went wrong");
    input = input.trim().to_string();
    input = input.to_uppercase();
    
    let input : char = match input.chars().next() {
        None => 'N',
        Some(thing) => thing
    };

    return input == 'Y';
}

fn menu(){
    let mut downloader  = YoutubeDownloaderProxy::new();

    loop{
        println!(".:Video downloader:.");
        println!("Please provide your yt link: ");
        let url = input_string();
        println!("Do you wanna save it in a different location? (Y/N): ");
        let answer = choice();
        
        if answer{
            println!("Please Provide the location: ");
            let location = input_string();
            let _a = downloader.blocking_download_to(&url,&location);
        }else{
            let _b = downloader.blocking_download(&url);
        }
        println!("Do you want to download another video? (Y/N)");
        let continue_loop = choice();

        if !continue_loop{
            break;
        }
    }
}