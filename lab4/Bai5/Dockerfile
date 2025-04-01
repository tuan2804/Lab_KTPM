# Sử dụng image golang làm base (ví dụ: golang:1.19)
FROM golang:1.19

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy toàn bộ mã nguồn vào container
COPY . .

# Build ứng dụng Go, tạo file thực thi tên "app"
RUN go build -o app .

# Expose cổng 8080 để ứng dụng có thể nhận yêu cầu
EXPOSE 8080

# Chạy ứng dụng khi container khởi động
CMD ["./app"]
