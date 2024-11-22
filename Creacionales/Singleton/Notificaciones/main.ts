import { Product,SMSNotificationService, EmailNotificationService, ShoppingCart } from ".";

const mouse = new Product(1, 'Mouse', 500)
const laptop = new Product(1, 'Laptop', 15000)
const monitor = new Product(1, 'Monitor', 3500)

const cart1 = new ShoppingCart(new EmailNotificationService)
const cart2 = new ShoppingCart(new SMSNotificationService('9212330334'))

cart1.addProduct(mouse, laptop, monitor);
monitor.applyDiscount(10)
cart2.addProduct(mouse, monitor)
cart1.checkout()
cart2.checkout()