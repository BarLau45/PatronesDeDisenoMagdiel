import pandas as pd

class ExternalUserAPI:
    def get_user_data(self):
        data = {
            'id':[1, 2, 3],
            'name': ['nava', 'rafa', 'moya'],
            'email': ['nava@uv.mx', 'rafadocs@gmail.com', 'moya@uv.mx']
        }
        return pd.DataFrame(data)