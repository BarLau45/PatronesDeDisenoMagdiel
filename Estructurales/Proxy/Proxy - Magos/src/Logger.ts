export class Logger {
    static info(message: string, ...args: any[]): void {
        const timestamp = new Date().toISOString();
        const formattedArgs = args.map(arg => typeof arg === "object" ? JSON.stringify(arg) : arg);
        const formattedMessage = message.replace(/{}/g, () => formattedArgs.shift());
        console.log(`${timestamp} [INFO] ${formattedMessage}`);
    }
}