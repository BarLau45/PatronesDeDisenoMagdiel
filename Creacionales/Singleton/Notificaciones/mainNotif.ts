import { DatabaseNotification } from "./DatabaseNotification";
import { EmailNotification } from "./EmailNotification";
import { NotificationManager} from "./NotificationManager";
import { PhoneNotification } from "./PhoneNotification";

const notificationManager = NotificationManager.getInstance();
const notificationManager2 = NotificationManager.getInstance();

const dbNotification = new DatabaseNotification(1)
const emailNotification = new EmailNotification('elpepe@tilin.com')
const phoneNotification = new PhoneNotification('9212330334')

notificationManager.sendNotification('new user registered', dbNotification)
notificationManager2.sendNotification('configure your email', emailNotification)
notificationManager.sendNotification('Your activation code is 5698', phoneNotification)

console.log('History: ', notificationManager.getNotificationHistory())