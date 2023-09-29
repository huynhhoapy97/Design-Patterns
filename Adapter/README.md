### Adapter Pattern
**Example 1:** 
Một đơn hàng sau khi hoàn tất giao hàng cho khách hàng thì nhân viên giao hàng
sẽ xác nhận giao hàng thành công. Lúc này sẽ xử lý như sau:

*Case cũ:*
Gửi tin nhắn xác nhận giao hàng thành công về số điện thoại khách hàng

*Case mới:*
Gửi email xác nhận giao hàng thành công về mail khách hàng

*Yêu cầu ở đây là:*
Code của sự kiện xác nhận giao hàng trong class đơn hàng (Order) không được
thay đổi, đảm bảo nguyên tắc Open - Close. Mặc dù hành vi của sự kiện đã 
được thay đổi

