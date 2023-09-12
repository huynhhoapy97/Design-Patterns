# Singleton Pattern

Đây là một Pattern thuộc nhóm **Creational Pattern**

Pattern này đảm bảo 1 class chỉ có duy nhất 1 thể hiện (instance)
và instance đó có thể được truy xuất toàn cục (static).

Pattern này được sử dụng với tần suất **khá nhiều**

*Lưu ý: Có thể sử dụng một biến toàn cục
nhưng nó phá vỡ nguyên tắc đóng gói (encapsulation) của OOP* 

Class áp dụng Singleton Pattern đảm bảo
chỉ duy nhất một instance của class được tạo ra trong chương trình
bằng cách:
* Tạo một constructor với modifier là private để 1 instance 
của class đó không thể được tạo từ bên ngoài (ở 1 class khác)
* Khởi tạo 1 instance của class đó như là 1 thuộc tính
với modifier là private static (không sử dung public static,
vì như vậy sẽ phá vỡ nguyên tắc đóng gói của OOP)
* Tạo 1 phương thức với modifier là public static rồi trả về
instance vừa tạo ở trên trong phương thức đó

Những cách để thực hiện Singleton pattern:
* Eager Initialization:
    * instance sẽ được khởi tạo
    ngay khi class được nạp vào bộ nhớ,
    qua đó có *nhược điểm thứ nhất là instance có thể không dùng tới*
    và *nhược đểm thứ hai là dễ bị phá vỡ bởi Reflection.*
* Static block Initialization:
    * tương tự như Eager Initialization, nhưng ở đây instance 
    được khởi tạo trong khối static, qua đó có thể kiểm soát được
    các exception hoặc có thể cung cấp thêm các xử lý khác.
* Lazy Initialization:
    * cách làm này khắc phục được việc instance có thể không dùng
    tới bằng việc kiểm tra instance đó đã được khởi tạo hay chưa
    trước khi khởi tạo nó trong hàm trả về instance và instance
    chỉ được khởi tạo khi hàm trả về instance được gọi,
    qua đó có *nhược điểm thứ nhất là trong môi trường đa luồng,
    tại cùng một thời điểm có thể có nhiều luồng cùng chạy
    và cùng gọi hàm trả về instance lúc đó có thể có nhiều hơn
    một instance được khởi tạo* và *nhược điểm thứ hai
    là nếu việc khởi tạo instance quá chậm thì người dùng 
    phải chờ lâu trong lần khởi tạo đầu tiên.*
* Thread Safe and Double Check Locking:
    * 2 cách này sẽ khắc phục được nhược điểm 
    của Lazy Initialization trong môi trường đa luồng
* Bill Pugh Initialization:
    * cách làm này ta sẽ tạo ra 1 static nested class gọi là
    class helper singleton. Khi class singleton chính được tải
    vào bộ nhớ thì class helper singleton chưa được tải vào bộ nhớ.
    Nó chỉ được tải khi phương thức khởi tạo instance được gọi.
    Với cách làm này ta sẽ tránh được nhược điểm instance được 
    khởi tạo mà có thể không dùng và nhược điểm có thể có nhiều
    instance được khởi tạo trong môi trường đa luồng.
    * Cách làm này được đánh giá là nhanh và hiệu quả nhất.

Sử dụng Singleton Pattern khi:
* Class dùng singleton pattern chỉ tồn tại một instance nên nó
thường được dùng cho các trường hợp như: Logger, Configuration,
Caching, Shared resources, ...
* Một số design pattern khác sử dụng singleton pattern để
triển khai như: Abstract Factory, Builder, Prototype, Facade, ...
    