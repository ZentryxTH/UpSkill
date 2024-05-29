let d;

d = new Date();

d = d.toString();

d = new Date(2024, 4, 29, 14, 30);

d = new Date('2024-05-29T14:30:00');
d = new Date('05/29/2024 14:30:30');
d = new Date('2024-07-29');
d = new Date('07-29-2024');

d = Date.now();

d = new Date('07-29-2024');
d = d.getTime();
d = d.valueOf();

d = new Date();

d = Math.floor(Date.now() / 1000);

console.log(d);