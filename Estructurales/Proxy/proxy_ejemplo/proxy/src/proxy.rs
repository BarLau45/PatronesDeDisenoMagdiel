use rusty_dl::{errors::DownloadError, youtube::YoutubeDownloader, Downloader, self};

pub trait Youtube {
    fn blocking_download(&mut self, url: &str) -> Result<(), DownloadError>;
    fn blocking_download_to(&mut self, url: &str, location: &str) -> Result<(), DownloadError>;

}

pub struct YoutubeDownloaderProxy {
    urls: Vec<String>,
    downloader: Option<Box<YoutubeDownloader>>
}

impl YoutubeDownloaderProxy {
    pub fn new() -> Self {
        return Self {
            urls: vec![],
            downloader: None
        };
    }

    pub fn check_url(&self, url : String) -> bool {
        let mut state = false;

        for link in &self.urls {
            if &url == link {
                state = true;
            }
        }

        return state;
    }
}

impl Youtube for YoutubeDownloaderProxy {
    fn blocking_download(&mut self, url: &str) -> Result<(), DownloadError> {
        if self.check_url(String::from(url)) {
            println!("The video has been already downloaded!");
        } else {
            self.urls.push( String::from(url) );
            self.downloader = Some(Box::new(YoutubeDownloader::new(url).expect("Invalid URL") ) );
            println!("Getting video...");
            self.downloader.as_mut().unwrap().blocking_download()?;
            print!("The video has been downloaded successfully");
        }

        Ok(())
    }

    fn blocking_download_to(&mut self, url: &str, location: &str) -> Result<(), DownloadError> {
        if self.check_url(String::from(url)) {
            println!("The video has been already downloaded!");
        } else {
            self.urls.push( String::from(url) );
            self.downloader = Some(Box::new(YoutubeDownloader::new(url).expect("Invalid URL") ) );
            println!("Getting video...");
            self.downloader.as_mut().unwrap().blocking_download_to(location)?;
            print!("The video has been downloaded successfully");
        }

        Ok(())
    }
}