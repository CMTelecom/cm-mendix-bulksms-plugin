

Description
-----------

With the CM SMS connector you can **send** and **receive** SMS with your Mendix application using the SMS gateway of CM. The connector supports all common features like real-time delivery reports, Unicode character set, multipart messages and more (see detailed feature list below).


**Why use the CM SMS Connector**
The CM SMS connector stands for 

 - Global coverage 	5 Billion phones in 220 countries Low latency 	90%
 -    Delivery within 10 seconds High throughput 	500 Messages per second
 -    Competitive pricing 	Country based pricing starting at less than 1    Euro cent per SMS

**2-way SMS**
The connector supports 2-way SMS conversations by linking the inbound reference of an reply SMS to the reference of the original outbound message. You can use shared CM long virtual numbers for free, or get your own dedicated numbers for a small monthly fee.

**Typical usage scenario**
SMS is used by all company sizes, in all industries all over the world. SMS is fast, personal, secure and has the highest and fastest open-rate of any communication channel available at the moment. 
Use SMS for example to send:

 - One-time-passwords for secure login to employees, suppliers and
   customers
 -	Order delivery status updates to customers
 -	Mobile customer questionnaires for measuring your service quality
 -	(critical) Announcements, updates or alerts to employees
 -	Special offers to customers and prospects
 -	Appointment reminders to patients

**Detailed feature overview**

-	Send SMS
 - Automatic encoding detection
 - Unicode support
 - Multipart support
 - Realtime status reports
 - Message validity time
 - Custom groupings
-	Receive SMS
 - Shared or dedicated virtual long numbers
 - Unicode support
 - Multipart support
 - 2-way conversations


#### Dependencies
- Mendix modeler 7.3.0 and above
- Rest services module


#### Installation and Configuration

In case you don’t have a CM account yet, get one at https://register.cmtelecom.com and get 10 test credits for free to send SMS. Get the CM Product token at https://gateway.cmtelecom.com and store this key in the app constant ProductToken. You’re ready to go.
Use the microflow `SUB_SendSMS` to send your first SMS

You can configure your webhooks for receiving status reports of the sent SMS and Inbound SMS in the platform as well. Choose for the GET method.

#### Demo
The CM Demo application allows you to test the SMS module and Number Verifier module of CM. The demo has both modules fully integrated in a fully functional app so you can actually test every functionality to see how it works.

#### Pricing
CM offers prepaid and postpaid packages at [https://www.cm.com/products/pricing/](https://www.cm.com/products/pricing/). 
Country and volume based SMS prices can be found at [https://www.cm.com/products/pricing/sms/](https://www.cm.com/products/pricing/sms/) starting with EUR 0.068 for The Netherlands, GBP 0.0286 for UK and USD 0.0044 for USA.
Creating a CM demo account is free including 10 test credits for sending SMS. 
To upgrade your CM account to a fully featured prepaid account go to [https://shop.cmtelecom.com/](https://shop.cmtelecom.com/) or apply for a postpaid account by sending an email to [plugins@cm.nl](mailto:plugins@cm.nl). 
