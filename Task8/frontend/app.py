from flask import Flask
import requests
app = Flask(__name__)
@app.route('/')
def index():
    try:
        # هنا بننادي الـ Backend بـ IP اللي حددناه في التاسك
        response = requests.get("http://10.0.0.10:5000")
        return f"Frontend connected to Backend! Response: {response.text}"
    except Exception as e:
        return f"Connection Failed: {str(e)}"
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
