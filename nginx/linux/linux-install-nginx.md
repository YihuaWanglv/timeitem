

# 在linux下安装部署nginx

一、安装准备
 
首先由于nginx的一些模块依赖一些lib库，所以在安装nginx之前，必须先安装这些lib库，这些依赖库主要有g++、gcc、openssl-devel、pcre-devel和zlib-devel 所以执行如下命令安装
 
[html] view plaincopy 
$   yum install gcc-c++  
$   yum install pcre pcre-devel  
$   yum install zlib zlib-devel  
$   yum install openssl openssl--devel  

 
二、安装Nginx
 
安装之前，最好检查一下是否已经安装有nginx
[html] view plaincopy 
$   find -name nginx  
如果系统已经安装了nginx，那么就先卸载
[html] view plaincopy 
$   yum remove nginx  
首先进入/usr/local目录
[html] view plaincopy 
$   cd /usr/local  
从官网下载最新版的nginx
[html] view plaincopy 
$   wget http://nginx.org/download/nginx-1.7.4.tar.gz  
解压nginx压缩包
[html] view plaincopy 
$   tar -zxvf nginx-1.7.4.tar.gz  
会产生一个nginx-1.7.4 目录，这时进入nginx-1.7.4目录
[html] view plaincopy 
$   cd  nginx-1.7.4  
接下来安装，使用--prefix参数指定nginx安装的目录,make、make install安装
[html] view plaincopy 
$   ./configure  $默认安装在/usr/local/nginx   
$   make  
$   make install      

如果没有报错，顺利完成后，最好看一下nginx的安装目录
[html] view plaincopy 
$   whereis nginx  

安装完毕后，进入安装后目录（/usr/local/nginx）便可以启动或停止它了。
到此，使用CentOS安装nginx已经完成了.

启动：
/usr/local/nginx/sbin/nginx
检查：
/usr/local/nginx/sbin/nginx -t
重新加载：
/usr/local/nginx/sbin/nginx -s reload
