Bài tập kiểm thử nâng cao

BIT220043-Nguyễn Văn Dưỡng

Mô tả kiểm thử:
Lớp AlgorithmUtils
Chứa các thuật toán cơ bản:

Bubble Sort: Sắp xếp mảng số nguyên theo thứ tự tăng dần.
![image](https://github.com/user-attachments/assets/83de88ea-8ccd-44fb-95e5-7b7eccb09ba1)

Binary Search: Tìm kiếm phần tử trong mảng đã sắp xếp.
![image](https://github.com/user-attachments/assets/03a3c068-7af9-4aec-97d2-35e4a289f10e)

Fibonacci (đệ quy): Tính số Fibonacci tại vị trí n.
![image](https://github.com/user-attachments/assets/41f2710f-b89f-427f-bf6b-f349d57cf44d)

Palindrome Check: Kiểm tra xem một chuỗi có phải là Palindrome không (sử dụng Stack).
![image](https://github.com/user-attachments/assets/0cef6a7e-25b4-478e-9882-71671a96fe42)

Dijkstra: Tìm đường đi ngắn nhất trong đồ thị có trọng số.
![image](https://github.com/user-attachments/assets/c0a4a867-f579-41cb-b747-5423f0bfc469)


Mô tả kiểm thử:

Tổng Quan
Kiểm thử được thực hiện trên lớp AlgorithmUtils, chứa các thuật toán thông dụng. Chúng ta sử dụng JUnit 5 để viết các bài kiểm thử tự động. Mục tiêu của kiểm thử là:

Đảm bảo các thuật toán hoạt động chính xác với đầu vào hợp lệ.
Kiểm tra các trường hợp đặc biệt (biên) để đảm bảo tính ổn định.
Kiểm tra xử lý ngoại lệ cho các đầu vào không hợp lệ.

![image](https://github.com/user-attachments/assets/ed9407d7-3acd-434b-a70d-dcf1340921d8)
![image](https://github.com/user-attachments/assets/db60a693-fab1-4259-af49-92fd3356cc36)


Mục tiêu kiểm thử:

1. Bubble sort:
Đảm bảo thuật toán sắp xếp đúng thứ tự tăng dần.
Xử lý tốt các trường hợp đặc biệt như mảng rỗng hoặc null.

2. Binary search:
Đảm bảo thuật toán tìm kiếm chính xác trong mảng đã sắp xếp.
Xử lý tốt các trường hợp không tìm thấy giá trị hoặc đầu vào không hợp lệ.

3. Fibonacci (Đệ Quy):
Đảm bảo thuật toán tính đúng số Fibonacci tại vị trí n.
Xử lý tốt các đầu vào không hợp lệ (âm).

4. Palindrome Check:
Đảm bảo thuật toán xác định chính xác chuỗi là Palindrome hay không.
Xử lý tốt các đầu vào không hợp lệ (null).

5. Dijkstra's Algorithm:
Đảm bảo thuật toán tính đúng khoảng cách ngắn nhất từ đỉnh nguồn đến các đỉnh khác trong đồ thị.

Kết quả kiểm thử:
![image](https://github.com/user-attachments/assets/005efad3-d607-4778-a062-bcb6edc99040)

ChatGPT:
![image](https://github.com/user-attachments/assets/19220966-4fbe-49be-9448-5c4165926294)
