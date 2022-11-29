# Better Ban Plugin
Better ban was developed by Ubiniti aka Bryce. This plugin allows you to have a better 
player banning experience.

This plugin includes:
1. Custom ban screen when a player joins the server
2. Player management GUI within the game
3. MySQL database support
4. Custom web portal **_Note - coming soon_**
5. Discord webhook integration 

## How to download:
You can download this plugin on spigot, or you can download the latest version that we are working on
here on GitHub by going under the target file

### Install web portal:
To install your web portal, you need a web host that provides **PHP 7.4+** and 
MySQL support. We recommend hosting your SQL server off your server host and connect it to your website. 
If you host your SQL server off your web server, if you web server goes down, players won't be able to join your server.
If your servers SQL is down, then your server is down too. 

1. Download web portal files from this link
   1. **LINK COMING SOON**
2. Upload the files and go to yourwebsite/install
3. From there, you'll be asked to input your MySQL username, password, host, and port
4. Then you'll be asked to make an account. You can make more later on
5. Then you should be done! Your bans should show up there. 

## Usage:

### Commands:
* /betterban _- opens the better ban menu_
* /betterban test _- tests the connect to your database_
* /punish <username\> _- opens the punish menu for players_


### Permissions:
```
.betterban.* - gives all permissions
.betterban.menu.* - allows player access to all menu access
.betterban.menu.view - allows players to view the menu
.betterban.menu.remove.ban - removes a players ban
.betterban.menu.remove.ip - removes an IP ban
.betterban.punish.* - allows full access to the punish menu
.betterban.punish.kick - allows player to kick a player
.betterban.punish.ban.temp - allows player to ban a player for a time frame
.betterban.punish.ban.perm - allows player to ban a player for perm
.betterban.punish.ban.ip - allows player to IP ban a player
```