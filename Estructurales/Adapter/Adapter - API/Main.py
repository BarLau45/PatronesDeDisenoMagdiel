from ExternalUserAPI import ExternalUserAPI
from UserAdapter import UserAdapter
from Logger import Logger

if __name__ == "__main__":
    external_user_API = ExternalUserAPI()
    user_df = external_user_API.get_user_data()
    logger = Logger()

    print(user_df)

    user_adapter = UserAdapter(user_df, logger)
    users = user_adapter.get_users()

    for user in users:
        print(user)

    filtered = user_adapter.filter_user_by_domain('uv.com')
    print("")
    for user in filtered:
        print(user)