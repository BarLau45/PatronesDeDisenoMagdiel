import logging

class Logger:
    def __init__(self, log_file = 'user_adapter.log'):
        logging.basicConfig(level = logging.INFO, filename = log_file, filemode = 'w', format = '%(asctime)s - %(filename)s - %(message)s')

    def log_info(self, message):
        logging.info(message)
    
    def log_error(self, message):
        logging.error(message)