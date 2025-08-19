# 基于官方Nginx镜像
FROM nginx:alpine

# 移除默认的Nginx配置
RUN rm /etc/nginx/conf.d/default.conf

# 将我们的Nginx配置文件复制到容器中
COPY nginx.conf /etc/nginx/conf.d/

# 将欢迎页面复制到Nginx的默认网页目录
COPY html/ /usr/share/nginx/html/

# 暴露80端口
EXPOSE 80

# 启动Nginx服务
CMD ["nginx", "-g", "daemon off;"]
